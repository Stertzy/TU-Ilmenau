% Skript zur Aufgabe 3:
% zu (A)  mit % werden Kommentare erzeugt
disp('Aufgabe A')
% Eingabe mit input: n = input(n), hier aber mit der Zuweisung n = 4
n = 4;
disp('Zeilenvektor, Nullvektor:'), x1a = zeros(1,n)
disp('oder mit letzter Komponente erzeugt:'), x1b(n) = 0; x1b
disp('Spaltenvektor:'), x1c = ones(n,1)
disp('Zeilenvektor:'), x1d = linspace(1,1,n)
disp('gleichverteilter Zufallsvektor als Zeilenvektor:') 
x2a = rand(1,n)
disp('normalverteilter Zufallsvektor als Spaltenvektor:') 
x2b = randn(n,1)
disp('Zeilenvektor:'), x3 = [5.33, -3.1,0.7]   
% achten Sie auf , oder Leerzeichen als Trennzeichen
disp('Spaltenvektor:'), x4 = [-5.17;-2.34;0.21] % achten Sie auf ;
x5a = [3:3:36], disp(' oder mit linspace:'), x5b = linspace(3,36,12)

% zu (B)
disp('Aufgabe B')
A1 = eye(n), A2 = zeros(n,n), A3 = hilb(n), A4 = magic(n)

A5 =[-5.1,0.07,4.6;5.2,-2.9,7.3;-0.5,4,77.5]
disp('weitere spezielle Matrizen:')
A6 = magic(n), A6 = pascal(n,0), A6 = hilb(n)
% (C)
disp('Aufgabe C')
a1 = [1,2,3, 4], a2 = [-2;2;1;-1], b1 = a1*a2
b2 = a1 .* a2', b3 = a1' .* a2
%  Zusatz, Tests:
disp('Zusatz, Tests:')
b4 = a1 + a2'
% (D)
disp('Aufgabe D')
A = [1,2,3,4;1,3,5,7;2,1,0,5;0,2,4,0], b = [1;-1;2;1], x = A*b
% (E)
disp('Skript-File zur Aufgabe (E)')
clear
n1 = input('Dimension des 1. Vektors:  Zeilenanzahl= '); v1 = zeros(n1,1);
%  v1 wird mit Nullen initialisiert, um Dimensions-Aenderungen in 
%  jedem Schritt zu vermeiden
disp('Eingabe der Vektorkomponenten:')
for k = 1: n1
  v1(k) = input(['v[',num2str(k),']= ']);  % beachte num2str(k)
end
n2 = input('Dimension des 2. Vektors:  Zeilenanzahl= '); v2 = zeros(n2,1);
for k = 1: n2
  v2(k) = input(['v[',num2str(k),']= ']);
end
if n1 == n2
  s1 = v1 + v2; 
  % oder in einer Schleife:
  % s1 = zeros(n2,1);  %  Initialisierung eines Summenvektors
  % for k = 1: n2
  %    s1(k) = v1(k) + v2(k);
  % end
  disp(' Vek 1  Vek 2  Summe'), disp([v1,v2,s1])
else
  disp('Dimensionen stimmen nicht ueberein')
end
% (F)
disp('Funktion zur Aufgabe (F) in der Datei vekmax.m')
disp('Aufruf durch folgende Anweisung: x = vekmax(s1)')
x = vekmax(s1)

