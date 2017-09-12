#!/bin/bash

for i in bachelor; do
  xelatex $i-thesis
  biber    $i-thesis
  xelatex $i-thesis
  xelatex $i-thesis
done

rm bachelor-thesis.{aux,log,bbl,bcf,blg,run.xml,toc,tct}
