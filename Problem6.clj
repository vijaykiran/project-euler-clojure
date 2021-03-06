;; The sum of the squares of the first ten natural numbers is,
;; 12 + 22 + ... + 102 = 385
;; The square of the sum of the first ten natural numbers is,
;; 
;; (1 + 2 + ... + 10)2 = 552 = 3025
;; Hence the difference between the sum of the squares of the first ten natural numbers 
;; and the square of the sum is 3025  385 = 2640.
;; 
;; Find the difference between the sum of the squares of 
;; the first one hundred natural numbers and the square of the sum.

;; brureforce

(- (#(* % %) (reduce + (range 1 101))) (reduce + (map #(* % %) (range 1 101))))

;; with some math :)

(-  (#(* % %) (/ (* 100.0 101.0) 2.0)) (/ (* 201.0 101.0 100.0) 6.0))