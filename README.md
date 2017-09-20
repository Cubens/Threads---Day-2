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

Excercise 3:
	
	a)
		1. I would guess the advantage would be to be able to create more randoms than with a single thread

		2. I think because most computers have 4 cores, but no i dont think 4 is always the right number

		3. I would use put(), so that the producer would be block when the queue is full

		4. Same thing as above, i would use take(), to make use of the blocking feature.

	b) 
		Done, no results

	c)
		Done, with put()

	d)
		Done

	f) 
		Results was as expected, 400 numbers generated and around equal amount of numbers in the two arrays Above50[] and below50[]

Excercise 4:

	a)
		Understood, roger & over..

	b)
		Done, i used the poll() method to retrieve urls for the queue, i dont know if this is the correct solution but it does work.
		The url string is set to the retrieved url if there is one, and if not the url string is set to null, which will terminate the thread.	

	c) 
		Done, same thing here, but this time i used the poll(timeout,timeunit) method, to make sure that once we were out of urls to consume, it would wait 10 seconds to make sure no more urls were being produced, before printing all the divs collected and terminating the thread.

	d)
		1. No

		2. Due to the randomness of threads startup time, and the websites servers, and my connection speed, so the order of which the data is fetched will be random.

		3. Well yes i could use a single thread hehe.

	e)
		I tried to implement a shared boolean but it didnt quite work out
