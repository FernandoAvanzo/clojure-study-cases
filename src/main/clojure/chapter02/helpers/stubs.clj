(ns chapter02.helpers.stubs)

(defn is-something-true? []
  true)

(defn log-message [message]
  (println message))

(defn store-something-in-db []
  (println "Storing" "something"  "in the database"))

(defn return-useful-value []
  42)
(defn request-on-queue? []
  false)

(defn pop-request-queue []
  {})

(defn handle-request [request]
  (println "Handling request" request))
