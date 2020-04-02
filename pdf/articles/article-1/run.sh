#!/bin/bash

for i in article-1; do
  xelatex $i
  biber   $i
  xelatex $i
  xelatex $i
done

rm article-1.{aux,log,bbl,bcf,blg,run.xml,toc,tct}
