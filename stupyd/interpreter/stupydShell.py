import cmd, sys
from .stupydInterpreter import Interpreter

class stupydShell(cmd.Cmd):
    intro = 'The stupyd-debugger. Type \'help\' or \'?\' for help.'
    prompt = '\nspd >> '

    def __init__(self, interpreter):
        super(stupydShell, self).__init__()
        self.interpreter = interpreter

    def do_info(self, arg):
        'print program general info'
        if arg:
            print('no attribute is required.')
        self.interpreter.dis()

    def do_next(self, arg):
        'execute next instruction'
        # return or not
        if self.interpreter.quit_flag == 1:
            print('program ended.')
            return

        # arg or not
        if arg:
            print('no attribute is required.')
        self.interpreter.debug_one_instruction()

    def do_break(self, arg):
        'set break point by given instruction index'
        if not arg:
            print('attribute required: target instruction index.')
        else:
            arg = int(arg)
            if 0 <= arg and arg <= len(self.interpreter.code_obj)*2 - 2 and arg%2 == 0:
                while(self.interpreter.pc != arg):
                    self.interpreter.execute_one_instruction()
                self.interpreter.debug_one_instruction()
            else:
                print('invalid attribute. type \'info\' to re-check.')

    def do_quit(self, arg):
        'quit debugger'
        if arg:
            print('no attribute is required.')
        else:
            print()
        return True
