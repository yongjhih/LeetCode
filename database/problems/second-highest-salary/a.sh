#!/usr/bin/env bash
./db.sh
sqlite3 db.db < a.sql
