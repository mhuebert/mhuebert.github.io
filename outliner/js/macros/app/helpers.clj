(ns app.helpers)

(defmacro self! [value]
  `(do (cljs.core/binding [~'self-id ~app.state/self-id]
         (app.cells/self! ~value))
       ~value))

