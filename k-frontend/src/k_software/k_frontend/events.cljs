(ns k-software.k-frontend.events
  (:require
   [re-frame.core :as re-frame]
   [k-software.k-frontend.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
