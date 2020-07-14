@echo off

pdflatex.exe -synctex=1 -interaction=nonstopmode "dokument".tex > compile.log

start compiler.cmd

exit