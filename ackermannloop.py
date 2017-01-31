# ackermannloop.py


# Ackermann function implemented iteratively in a while loop
def A_iter(x, y, x_list=[]):
	while True:
		if x == 0:
			y = y + 1
			if x_list:
				x = x_list.pop()
			else:
				return y
		elif y == 0:
			y = 1
			x = x - 1
		else:
			y = y - 1
			x_list.append(x - 1)


# Ackermann function implemented recursively
def A(x, y):
	if x == 0:
		y = y + 1
	elif y == 0:
		y = A(x - 1, 1)
	else:
		y = A(x - 1, A(x, y - 1))
	return y


print(A_iter(1, 2))
print(A(1,2))
