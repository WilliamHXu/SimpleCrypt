# SimpleCrypt
a simple set of crypt problems.

Create a few ciphers. Use String inside of your classes.

* ROT13 - take the 26 letters of the alphabet and create a `String <- doRot13(String)` method in the ROT13 class
* Caesar - make a subclass of ROT13 that implements the famous caesar cipher.
* Create you own cipher, using a different set of 

## Explanation

ROT13 ("rotate by 13 places", sometimes hyphenated ROT-13) is a simple letter substitution cipher that replaces a letter with the 13th letter after it, in the alphabet. ROT13 is a special case of the Caesar cipher, developed in ancient Rome.

Because there are 26 letters (2×13) in the basic Latin alphabet, ROT13 is its own inverse; that is, to undo ROT13, the same algorithm is applied, so the same action can be used for encoding and decoding. The algorithm provides virtually no cryptographic security, and is often cited as a canonical example of weak encryption.

ROT13 is used in online forums as a means of hiding spoilers, punchlines, puzzle solutions, and offensive materials from the casual glance. ROT13 has been described as the "Usenet equivalent of a magazine printing the answer to a quiz upside down".[2] ROT13 has inspired a variety of letter and word games on-line, and is frequently mentioned in newsgroup conversations.

Applying ROT13 to a piece of text merely requires examining its alphabetic characters and replacing each one by the letter 13 places further along in the alphabet, wrapping back to the beginning if necessary.[3] A becomes N, B becomes O, and so on up to M, which becomes Z, then the sequence continues at the beginning of the alphabet: N becomes A, O becomes B, and so on to Z, which becomes M. Only those letters which occur in the English alphabet are affected; numbers, symbols, whitespace, and all other characters are left unchanged. Because there are 26 letters in the English alphabet and 26 = 2 × 13, the ROT13 function is its own inverse:[3]

{\displaystyle {\mbox{ROT}}_{13}({\mbox{ROT}}_{13}(x))=x} {\mbox{ROT}}_{13}({\mbox{ROT}}_{13}(x))=x for any basic Latin-alphabet text x.
In other words, two successive applications of ROT13 restore the original text (in mathematics, this is sometimes called an involution; in cryptography, a reciprocal cipher).

The transformation can be done using a lookup table, such as the following:

Input	ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
Output	NOPQRSTUVWXYZABCDEFGHIJKLMnopqrstuvwxyzabcdefghijklm
For example, in the following joke, the punchline has been obscured by ROT13:

```
Why did the chicken cross the road?
Gb trg gb gur bgure fvqr!
```
Transforming the entire text via ROT13 form, the answer to the joke is revealed:
```
Jul qvq gur puvpxra pebff gur ebnq?
To get to the other side!
```
