(ns game.core
  (:require [arcadia.core :refer :all]
            [arcadia.linear :as l])
  (:import [UnityEngine Vector3]))
;; `C-c C-k`就可以生成core.clj.meta : 每个资源文件（外部导入和内部创建的）对应一个.meta文件。这个.meta文件中的guid就唯一标识这个资源。

(defonce c (create-primitive :cube))

(defn move!
  [go v3]
  (set! (.. go transform position)
        (l/v3+ (.. go transform position)
               v3)))

;;(move! c (Vector3. 2 0 0)) ;; 在Scene页面上面移动成功了
