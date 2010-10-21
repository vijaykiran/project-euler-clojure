;;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
;; The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(apply + (filter #(cond (zero? (rem % 3)) true
												(zero? (rem % 5)) true
												:else false) (take 1000 (range 1 1000))))
