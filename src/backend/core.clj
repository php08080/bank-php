(ns backend.core
  (:require [org.httpkit.server :as hk-server])
  (:gen-class))

;;ignorar binding sin uso
#_{:clj-kondo/ignore [:unused-binding]}

(defn app [req]
  {:status 200
   :header {"content-Type" "plain/text"}
   :body "Mi primera respues de servidos :D"})


(defn -main
  "Inicializa mi servidor"
  []
  (println "Mi primer programa en clojure")
  (hk-server/run-server app {:port 4000}))




