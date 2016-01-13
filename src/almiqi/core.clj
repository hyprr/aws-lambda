(ns almiqi.core
  ;; this part is quite importand . it wont work otherwise.
  (:require [clojure.data.json :as json])
  (:gen-class
   :methods [^:static [handler [String] String]]))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


;;; funtion name is important . especially that dash.
(defn -handler [s]
  (println s)
  (json/write-str {:name "haha"}))
