(ns giggin.components.helpers)



(defn format-price
  [cents]
  (str " $" (/ cents 100)))
