;;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
;; The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn divisible-by-3-5 
  "Tests if n is divisible by 3 or 5"
  [n]
  (cond	(zero? (rem n 3)) true
				(zero? (rem n 5)) true
				:else false))


(apply + (filter divisible-by-3-5 (take 1000 ( range 1 1000))))


;; mysumall - overr engineering due to ignorance :)

; (defn mysumall 
;   ([nums] (mysumall nums 0))
; 	([nums sum]
; 		(let [f (first nums)
; 					r (rest nums)]
; 				(if (zero? (count r))
; 					(+ sum f)
; 					(mysumall r (+ sum f))))))
; 
; 
; (mysumall (filter divisible-by-3-5 (take 1000 ( range 1 1000))))

