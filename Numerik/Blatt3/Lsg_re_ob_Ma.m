function x = Lsg_re_ob_Ma( R ,y)
%  Loesung eines gestaffelten LGS mit oberer 
n = length(R);
x = zeros(n,1); % Initialisierung von x mit Nullen
x(n) = y(n) / R(n,n);
for j = n-1: -1 : 1
    x(j) = (y(j) - R(j, j + 1 : n) * x( j + 1 : n)) / R(j,j);
end
      