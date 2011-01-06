;; A palindromic number reads the same both ways. 
;; The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
;; Find the largest palindrome made from the product of two 3-digit numbers.

(:require '[clojure.string as :str])
(defn palindrome? 
  [n]
	(let [x (format "%d" n)]
		(= x (apply str (reverse x)))))
	

(doseq [x (range 999 99 -1)]
	(doseq [y (range 999 99 -1)]
		(let [r (* x y)]
			(if (palindrome? r) r))))
			

; Another silly way to loop multiplications, bigger numbers run forever
(apply max (loop [ m '() x (range 1 11)]
	(if (seq (rest x)) 
			(recur (concat m 
				(loop [n '() y (range 1 11)] 
					(if (seq (rest y)) 
						(recur (cons (* (first y) (first x)) n) (rest y)) 
						n)))
					(rest x))  m)))
					
					

			
		