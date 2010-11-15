;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?

(defn factor
	"Finds out the largest factor for the given number n"
	[n i]
  (if (= n i)
    n
    (if (zero? (mod n i))
      (factor (/ n i) i)
      (factor n (inc i)))))


(factor 600851475143 2)