function [R,L] = my_LR( A)
% Test auf Dimensionen
n = length(A);
L = eye(n);

for i = 1 : n-1 
  if abs( A(i,i)) < 1e-12, error(['Abbruch, da Null in Zeile ',num2str(i)]); 
  else
    for j = n : -1 : i+1 
       L(j,i) = A(j,i) / A(i,i);
       A(j,i:n) = A(j,i:n) - A(i,i:n) * L(j,i);
    end
  end
end 
if abs(A(n,n)) < 1e-12,  error('Abbruch')
else 
    R = A; 
end