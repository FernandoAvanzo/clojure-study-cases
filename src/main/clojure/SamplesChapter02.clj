(ns SamplesChapter02)

(comment
  ;; clojure hello world
  (println "hello world")

  ;; define a function with def
  (def my-addition (fn [a b] (+ a b)))

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
  (.endsWith "program.clj" ".clj")

  ;clojure contagiousness principle example
  (+ 1 1N)
  (+ 1 1N 1/2)
  (+ 1 1N 1/2 0.5M)
  (+ 1 1N 1/2 0.5M 0.5))
