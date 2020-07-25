clc, clear, format compact

disp('Ausgleichsrechnung mit Normalen-Gleichungen:')
% Eingabe der Matrix A und des Vektors b = m und dann Ausgabe
A=[1,6,0; 1,7,1; 1,9,2; 1,11,3; 1,13,4; 1,15,5; 1,17,6; 1,18,7; 1,19,8];
m = [96 189 283 373 467 553 647 733 832]';
disp('A = '), disp(A), disp('m = '), disp(m)
% Erzeugung der Matrix B und der rechten Seite c
B = A'*A;
disp('B = A^T * A = '), disp(B)
c = A' * m; disp('c = A^T * m ='), disp(c)
x = B\c;
disp('Ergebnis:'), disp(x)

disp('Berechnung des gesuchten Werts:')
kosten = x(1) + 10*x(2) + 5 * x(3);
fprintf('Fuer eine 5 Jahre alte Maschine mit 1000 Arbeitsstunden\n')
fprintf('ergeben sich voraussichtlich Kosten von %5.2f Euro\n',kosten)
