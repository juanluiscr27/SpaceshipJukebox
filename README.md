# Spaceship Jukebox

-----
This project look for setting a practice on how the Object-Oriented Analysis and Design process
works. Here we go from each stage, from the customer requirements to the coding phase in the programming
language we choose.

The astronauts need some music for their long journey to the moon. So we need your help to design a
jukebox for our moon shuttle. As astronauts don't carry money with them, this jukebox will
be free to use. But we don't want to let just one person pick all the music and drive the others crazy.

The jukebox should let a user select an album from the available music library, and then choose
individual songs from that album to be played. And as an extra precaution, if one astronaut adds more
than three songs in a row to the play queue, and another astronaut wants to play a song, they'll jump
ahead in line.

First, write a set of requirements to design the jukebox. Try to come up with at least three functional
and three non-functional requirements. Use the attributes of FURPS+ to inspire possible requirements.

## Requirements
**Functional Requirements:**
- The system must maintain a music library of albums and songs. 
- The system must allow users to browse those albums and songs
- The system must allow users to select individual songs, and preventing them from playing full albums. 
- The system must maintain a queue of songs to play.
- The jukebox needs to actually play music. 
- The system must allow the user to sort by artists.
- The jukebox should identify individual users.
- The system must track the number of plays per user.

**Non-Functional Requirements**

*Usability:*
- The system should be intuitive to use while the astronauts are floating around in space.

*Reliability:* 
- The jukebox need to be available for them all day, every day, 24/7.

*Performance:*
- The system to be low-power.

*Supportability:* 
- The jukebox should have an updatable music library. 

## Use Case and User Stories

### Use cases scenario for selecting a song to play

---
**Title:** Play a Song

**Primary Actor:** User

**Success Scenario:** The system identifies the user. The user browses the library of available 
albums. The user selects an album and browse the list of songs on the selected album. Finally, the user 
selects a song. The system plays selected song.

### Use cases scenario for selecting multiple songs to play

---
**Title:** Select Multiple Songs

**Primary Actor:** User

**Success Scenario:**
1. System identifies the user. 
2. User browses the library of available albums. 
3. User selects an album and browse the list of songs on the selected album.
4. User selects a song. 
5. System begins playing selected song.
6. User continues browsing and selects a second song.
7. System adds that second song to a play queue.
8. System plays the second song after the first song is over.

### User stories

---
- As a user, I want my song to be added to the front of the long play queue, so that I don't have to 
wait hours to hear it.
- As a user, I want to be identified without having to touch anything, so that I can use my hands to 
do other things.
- As a user, I want to sort and browse songs by artist, so that I can listen to every song of my
favorite artists.
- As the spaceship's commander, I want the ability to cancel other users' selections, so that I don't 
have to listen to other user section if I don't want.

## Domain Modeling

## Class Diagrams

## Class Relationships


