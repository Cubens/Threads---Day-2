# Threads---Day-2


Excercise 1:

a) 
	Due to requesting stuff over the internet... End servers might be slow, internet connection might be slow etc etc.

b) 
	Because the class already has a Run method, extend Thread and add a override annotation and its ready to go

c) 
	1. The big diffrence is that they now run as seperate threads and can now perform tasks simultaneously
	
	2. Becuase they print right after starting the threads, it takes time for the threads to start and get the data, and now the main thread just keeps on going whereas before it would wait for the .run method to finish.

	3. Fixed the problem simply by using Thread.join() which makes the caller thread wait until said joined thread has terminated.

d)
	The results was that parallel execution was about twice as fast as the sequential execution. So that was as expected.


Excercise 2:

	Very good example, and working like a charm.