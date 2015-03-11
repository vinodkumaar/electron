#!/bin/sh

pid=`pgrep -f electron.jar`

if [ "$pid" != "" ]
then
  kill -9 $pid
fi
