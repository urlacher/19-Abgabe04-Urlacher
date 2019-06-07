# Queue

A Queue is a Data Structure working on the FIFO (First In First Out) principal.

A queue is a dynamic data structure that can store any number of elements, but the stored elements can only be read again in the same order in which they were stored.

![Queue function](./images/queue.png)

## Methods

### INSERT

#### offer(element)

Inserts an Element into Queue. Returns boolean about the insertion satus.

### REMOVE

#### remove() Throws Exception

Removes the first Item from the queue. Throws an Exception if the queue is empty.

#### poll()

Removes the first Item from the queue. Returns Null if the queue is empty.

### EXAMINE

#### element() Trows Exception

Return the first Item from the queue. Throws an Exception if the queue is empty.

#### peek()

Return the first Item from the queue. Returns Null if the queue is empty.
