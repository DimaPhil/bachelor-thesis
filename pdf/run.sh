#!/bin/bash

for i in bachelor; do
  pdflatex $i-thesis
  biber    $i-thesis
  pdflatex $i-thesis
  pdflatex $i-thesis
done

rm bachelor-thesis.{aux,log,bbl,bcf,blg,run.xml,toc,tct}
