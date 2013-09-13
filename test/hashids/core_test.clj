(ns hashids.core-test
  (:use clojure.test
        hashids.core))

(deftest encrypt-test
  (testing "Encrypt of number should return string"
    (is (= (encrypt 134 "secret-salt") "x7e")))
  (testing "Encrypt same number should return same string when salt is the same"
    (is (= (encrypt 134 "secret-salt") "x7e")))
  (testing "Encrypt same number should return different string when number is differnet"
    (is (= (encrypt 135 "secret-salt-new") "7Aj")))
  (testing "Encrypt same number should return different string when salt is different"
    (is (= (encrypt 134 "secret-salt-new") "xro"))))


(deftest decrypt-test
  (testing "Decrypt of string should return number"
    (is (= (decrypt "x7e" "secret-salt") 134)))
  (testing "Decrypt of string should always return same number"
    (is (= (decrypt "x7e" "secret-salt") 134)))
  (testing "Decrypt of string should always return different number when salt is different"
    (is (= (decrypt "x7e" "secret-salt-new") 474)))
  (testing "Decrypt of string should always return different number when string is different"
    (is (= (decrypt "x7ea" "secret-salt") 4046))))
