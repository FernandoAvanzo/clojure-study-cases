(ns SamplesChapter02)


(def my-addition (fn [a b] (+ a b)))

(println "hello world")

(def x 1)
(cond
  (> x 0) "Greater!"
  (= x 0) "zero!"
  (< x 0) "lesser!")
