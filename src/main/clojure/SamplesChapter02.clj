(ns SamplesChapter02)

(comment
  (def my-addition (fn [a b] (+ a b)))

  (println "hello world")

  ;cond function used to evaluate a series of conditions
  (def x 1)
  (cond
    (> x 0) "Greater!"
    (= x 0) "zero!"
    (< x 0) "lesser!")

  ;commas are optional
  (+ 1 2 3 4 5)

  (+ 1, 2, 3, 4, 5)

  (+ 1, 2, 3, 4, 5)

  (+ 1,,,,, 2, 3 4,, 5)

  ;case where the comma is used as a separator
  (def a-map {:a 1 :b 2 :c 3})
  (println a-map)

  ;java interop example
  (.contains "clojure-in-action" "-")
  (.endsWith "program.clj" ".clj"))
