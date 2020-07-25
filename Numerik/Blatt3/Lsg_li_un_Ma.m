function y = Lsg_li_un_Ma( L ,b)
%  Loesung eines gestaffelten LGS mit unterer Deieecksmatrix mit 1 in HD
n = length(L);
y = zeros(n,1); % Initialisierung von x mit Nullen
y(1) = b(1);
for j = 2: n
    y(j) = b(j) - L(j,  1 : j-1) * y( 1 : j-1);
end
      