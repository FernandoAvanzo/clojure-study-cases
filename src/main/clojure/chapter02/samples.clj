(ns chapter02.samples)

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
  (+ 1 1N 1/2 0.5M 0.5)

  ;clojure number overflow example
  (inc 9223372036854775807)

  ;clojure auto-promotion example
  (inc' 9223372036854775807)

  ;clojure keyword, symbol, name and namespace functions
  (keyword "foo")
  ;=> :foo
  (symbol "foo" "bar")
  ;=> foo/bar
  (name :foo/bar)
  ;=> "bar"
  (namespace :foo)
  ;=> nil
  (name "baz")
  ;=> "baz"

  ;Use the list function to create a list and the list? function to test for list types:
  (list 1 2 3 4 5)
  ;=> (1 2 3 4 5)
  (list? *1)
  ;=> true

  ;Use the conj function to create a new list with another value added to it:
  (conj (list 1 2 3 4 5) 6)
  ;=> (6 1 2 3 4 5)
  (conj (list 1 2 3) 4 5 6)
  ;=> (6 5 4 1 2 3)
  (conj (conj (conj (list 1 2 3) 4) 5) 6)
  ;=> (6 5 4 1 2 3)  same as above

  ;treating lists like stacks
  (peek (list 1 2 3))
  ;=> 1
  (pop (list 1 2 3))
  ;=> (2 3)
  (peek (list))
  ;=> nil Head of an empty list is nil
  (pop (list))
  ;=> IllegalStateException Can't pop empty list

  ;using the count function
  (count (list))
  ;=> 0
  (count (list 1 2 3 4))
  ;=> 4

  ;everything is a list
  (+  1 2 3)
  ;=> 6 that call function can be interpreted as a list
  ; where the head is the function and the tail is the arguments

  ;Do not forget of the leading single quote
  (def three-numbers '(1 2 3))
  ;=> #'SamplesChapter02/three-numbers

  ;declaring vectors
  (vector 10 20 30 40 50)
  ;=> [10 20 30 40 50]
  (def the-vector [10 20 30 40 50])
  ;=> #'chapter02.samples/the-vector
  )
