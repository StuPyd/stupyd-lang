import sys
sys.path.append("..")
from stupyd.interpreter.stupydInterpreter import Interpreter
from stupyd.interpreter.stupydShell import stupydShell

class test_runner:
    def __init__(self, code_obj, num_array, id_array):
            self.code_obj = code_obj
            self.num_array = num_array
            self.id_array = id_array
    def run(self):
        stupyd = Interpreter(self.code_obj, self.num_array, self.id_array)
        stupyd.run_code()

'''
design your test instance here

source code:
    num[3] a
    1 -> a[0]
    2 -> a[1]
    3 -> a[2]
    print(a[1])
    print(a)

id_array: a, a, a, a, a, a
num_array: 3, 1, 0, 2, 1, 3, 2, 1
code_obj:
    DECL_FAST(0) a
    LOAD_NUM(0) 3
    BUILD_ARRAY(-1) 
    STORE_FAST(0) a
    
    LOAD_NUM(1) 1
    LOAD_FAST(1) a
    LOAD_NUM(2) 0
    STORE_SUBSCR(-1)
    STORE_FAST(1) a
    
    LOAD_NUM(3) 2
    LOAD_FAST(2) a
    LOAD_NUM(4) 1
    STORE_SUBSCR(-1)
    STORE_FAST(2) a
    
    LOAD_NUM(5) 3
    LOAD_FAST(3) a
    LOAD_NUM(6) 2
    STORE_SUBSCR(-1)
    STORE_FAST(3) a
    
    LOAD_FAST(4) a
    LOAD_NUM (7) 1
    LOAD_SUBSCR(-1) 
    PRINT(-1)
    
    LOAD_FAST(5) a
    PRINT(-1)
    
    QUIT(-1)

'''

def main():
    num_array = [3, 1, 0, 2, 1, 3, 2, 1]
    id_array = ['a', 'a', 'a', 'a', 'a', 'a']
    code_obj = {
        0: [1, 0],
        2: [0, 0],
        4: [18, -1],
        6: [2, 0],

        8: [0, 1],
        10:[3, 1],
        12:[0, 2],
        14:[20, -1],
        16:[2, 1],

        18: [0, 3],
        20: [3, 2],
        22: [0, 4],
        24: [20, -1],
        26: [2, 2],

        28: [0, 5],
        30: [3, 3],
        32: [0, 6],
        34: [20, -1],
        36: [2, 3],

        38: [3, 4],
        40: [0, 7],
        42: [19, -1],
        44: [7, -1],

        46: [3, 5],
        48: [7, -1],

        50: [13, -1],
    }
    stupyd = Interpreter(code_obj, num_array, id_array)
    shell = stupydShell(stupyd)
    shell.cmdloop()

main()