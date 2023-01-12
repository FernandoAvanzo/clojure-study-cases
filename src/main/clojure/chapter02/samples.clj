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
  (+ 1 2 3)
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

  ;Using the function get and nth
  (get the-vector 2)
  ;=> 30
  (nth the-vector 2)
  ;=> 30
  (get the-vector 10)
  ;=> nil
  (nth the-vector 10)
  ;=> IndexOutOfBoundsException

  ;Using assoc to modify a vector
  (assoc the-vector 2 25)
  ;=> [10 20 25 40 50] You can change an existing index.
  (assoc the-vector 5 60)
  ;=> [10 20 30 40 50 60] You can add on to the end.
  (assoc the-vector 6 70)
  ;=> IndexOutOfBoundsException You can’t add past the end.

  ;conj function applied in vectors
  (conj [1 2 3 4 5] 6)
  ;=> [1 2 3 4 5 6]

  ;using peek and pop functions in vectors
  (peek [1 2])
  ;=> 2
  (pop [1 2])
  ;=> [1]
  (peek [])
  ;=> nil Peeking an empty collection always returns nil.
  (pop [])
  ;=> IndexOutOfBoundsException Popping an empty collection always throws an exception.

  ;vectors working as function
  (the-vector 3)
  ;=> 40

  ;common clojure map declaration
  (def the-map {:a 1 :b 2 :c 3})
  ;=> #'chapter02.samples/the-map

  ;Using the hash-map function to declare a map
  (hash-map :a 1 :b 2 :c 3)
  ;=> {:c 3, :b 2, :a 1}

  ;maps also are functions
  (the-map :b)
  ;=> 2

  ;Keywords and map acting as functions
  (:b the-map)
  ;=> 2
  (:z the-map 26)
  ;=> 26 Keywords can also return a default value if not found.

  ;using assoc and dissoc functions
  (def updated-map (assoc the-map :d 4))
  ;=> #'chapter02.samples/updated-map
  updated-map
  ;=> {:a 1, :b 2, :c 3, :d 4}
  (dissoc updated-map :a)
  ;=> {:b 2, :c 3, :d 4}

  ;Clojure nested maps are a immutable Data Structures sample.
  (def users {:kyle {
                     :date-joined "2009-01-01"
                     :summary     {
                                   :average {
                                             :monthly 1000
                                             :yearly  12000
                                             }
                                   }}})
  ;=> #'chapter02.samples/users

  ;assoc-in function
  (assoc-in users [:kyle :summary :average :monthly] 3000)
  ;=> {:kyle {:date-joined "2009-01-01", :summary {:average {:monthly 3000, :yearly 12000}}}}

  ;get-in function
  (get-in users [:kyle :summary :average :monthly])
  ;=> 1000

  ;update-in function
  (update-in users [:kyle :summary :average :monthly] + 500)
  ;=> {:kyle {:date-joined "2009-01-01", :summary {:average {:monthly 1500, :yearly 12000}}}}

  ;Using the functions first and rest
  (first (list 1 2 3 ))
  ;=> 1
  (rest (list 1 2 3 ))
  ;=> (2 3)
  (first [1 2 3])
  ;=> 1
  (rest [1 2 3])
  ;=> (2 3)
  (first {:a 1 :b 2})
  ;=> [:a 1] Order of items isn’t guaranteed.
  (rest {:a 1 :b 2})
  ;=> ([:b 2])
  (first [])
  ;=> nil Empty collections return nil for first.
  (rest [])
  ;=> () Empty collections return an empty sequence for rest.

  ;given an element and data structure cons create a new sequence
  (cons 1 [2 3 4 5])
  ;=> (1 2 3 4 5)

  ;Lazy evaluation with sequences
  (list? (cons 1 (list 2 3)))
  ;=> false
  )
