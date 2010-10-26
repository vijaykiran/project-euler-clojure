; Each new term in the Fibonacci sequence is generated by adding the previous two terms.
; By starting with 1 and 2, the first 10 terms will be:
;   1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
; Find the sum of all the even-valued terms in the sequence which do not exceed four million (4000000).
;;  Answer: 4613732

;; fib-seq method from the clojure wiki
(defn fib-seq []
  ((fn rfib [a b] 
       (cons a (lazy-seq (rfib b (+ a b)))))
    1 2))

;;  Here's the one that is the real stuff :-)
(reduce + (take-while #(< % 4000000) (filter even? (fib-seq))))


;; by manual trail & error found that 11 numbers are needed in the series
;; (reduce + (take 11 (filter even? (fib-seq))))
