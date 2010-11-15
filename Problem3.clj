;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?

(defn factor [n i]
  (if (= n i)
    n
    (if (zero? (mod n i))
      (factor (/ n i) i)
      (factor n (inc i)))))


(factor 600851475143 2)