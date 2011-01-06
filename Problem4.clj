;; A palindromic number reads the same both ways. 
;; The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
;; Find the largest palindrome made from the product of two 3-digit numbers.

(:require '[clojure.string as :str])
(defn palindrome? 
  [n]
	(let [x (format "%d" n)]
		(= x (apply str (reverse x)))))
	
(println 
	(apply max (filter #(not (nil? %)) (distinct (for [i (range 999 99 -1) j (range 999 99 -1)] 
		(if (palindrome? (* i j)) (* i j)))))))
		