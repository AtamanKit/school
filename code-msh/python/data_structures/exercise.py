sentence = "This is a common interview question"

################## Using tuples ###################################
# _list = []
# check_letter = False

# for letter in sentence:
#     incr = 0
#     for element in _list:
#         if letter == element[0]:
#             check_letter = True
#             break
#     if not check_letter:
#         for letter_sc in sentence:
#             if letter == letter_sc:
#                 incr+=1

#         _tuple = (letter, incr)
#         _list.append(_tuple)
    
# _set = set(_list)
# _list = list(_set)
# _list.sort(key=lambda item:item[1], reverse=True)
# first_list_tuple = _list[0] if _list[0][0] != " " else _list[1]
# letter, number = first_list_tuple

################## Usint dictionary ################
letter_dictionary = {}

for letter in sentence:
    if letter in letter_dictionary:
        letter_dictionary[letter] += 1
    else:
        letter_dictionary[letter] = 1

sorted_letter_dictionary = sorted(
        letter_dictionary.items(),
        key=lambda item:item[1], 
        reverse=True
    )

first_tuple = sorted_letter_dictionary[0] \
    if sorted_letter_dictionary[0][0] != " " else \
    sorted_letter_dictionary[1]

letter, number = first_tuple
print("letter", letter)
    
