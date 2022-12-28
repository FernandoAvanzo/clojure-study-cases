(ns SamplesChapter02)


(def my-addition (fn [a b] (+ a b)))

(println "hello world")

(def x 1)
(cond
  (> x 0) "Greater!"
  (= x 0) "zero!"
  (< x 0) "lesser!")

(comment
  (+ 1 2 3 4 5)

  (+ 1, 2, 3, 4, 5)

  (+ 1, 2, 3, 4, 5)

  (+ 1,,,,, 2, 3 4,, 5)

  ;case where the comma is used as a separator
  (def a-map {:a 1 :b 2 :c 3})
  (println a-map)
  )

