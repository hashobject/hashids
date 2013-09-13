(ns hashids.core
  (:import (hashids Hashids)))

(defn encrypt [id salt]
  (.encrypt (Hashids. salt) (long id)))

(defn decrypt [code salt]
  (first (.decrypt (Hashids. salt) code)))
