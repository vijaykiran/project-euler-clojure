;; A palindromic number reads the same both ways. 
;; The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
;; Find the largest palindrome made from the product of two 3-digit numbers.

(:require '[clojure.string as :str])
(defn palindrome? 
  [n]
	(= (format "%d" n) (apply str (reverse (format "%d" n)))))


(doseq [x (range 999 99 -1)]
	(doseq [y (range 999 99 -1)]
		(if (palindrome? (* x y))
			(* x y))))
			

			