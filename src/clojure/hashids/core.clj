(ns hashids.core
  "Clojure wrapper for Hashids"
  (:import (hashids Hashids)))

(defn encrypt [id salt]
  "Encrypt number into string using salt"
  (.encrypt (Hashids. salt) (long id)))

(defn decrypt [code salt]
  "Decrypt number from the string using salt"
  (first (.decrypt (Hashids. salt) code)))
