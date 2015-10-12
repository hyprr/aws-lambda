(ns almiqi.core
  (:gen-class
   :methods [^:static [handler [String] String]]))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn -handler [s]
  (str "Hello " s "!"))
