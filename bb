#!/usr/bin/env bash

while [[ $# -gt 0 ]]
do
key="$1"

case $key in
    project)
      buck project
      shift
    ;;
    run)
      buck fetch //...
      buck run :reldash
      shift
    ;;
    *)
          echo wat?
    ;;
esac
shift # past argument or value
done