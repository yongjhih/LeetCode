#!/usr/bin/env bash

sqlite3 db.db < db.sql
sqlite3 -init db.init db.db
