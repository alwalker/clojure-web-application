(ns sample.db)

(def db (or (System/getenv "DATABASE_URL")
          "thisdoesntactuallywork"))
