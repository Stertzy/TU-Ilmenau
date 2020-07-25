function [R,y] = my_gauss( A, b)
% Test auf Dimensionen
n = length(A);
y = zeros(n,1);
A = [A,b];
for i = 1 : n-1 
  if abs( A(i,i)) < 1e-12, error(['Abbruch, da Null in Zeile ',num2str(i)]); 
  else
    for j = n : -1 : i+1 
       f = A(j,i) / A(i,i);
       A(j,i+1:n+1) = A(j,i+1:n+1) - A(i,i+1:n+1) * f;
    end
  end
end 
if abs(A(n,n)) < 1e-12,  error('Abbruch')
else 
    R = A(1:n,1:n); y = A(1:n, n+1)
end