# HappyHackathong Gainsight Happy Hack
Problem Statement - 1

PlanMyTrip, Inc., is a travel portal that specializes in hotel reservations. They distinguish themselves by providing curated reviews of the hotels from the people that have made hotel reservations from their portal and stayed at those hotels.

Over the years they have accumulated numerous reviews of the hotel properties from their end users. They now want to realize of the value of the data that they own; wherein they want to process the data and derive meaningful insights and recommendations based on the data for both their portal users and hotels that they partner with.

1. Data available to us

Available data includes “user reviews by hotel” and there is one file per hotel. Each data file includes the following elements:

a. Hotel information

i. Hotel URL (points to “Trip Advisor” page of the Hotel)

ii. Overall Rating

iii. Average Price

b. Reviews (multiple reviews can exist per hotel)

i. Author of the review

ii. Review text (Content)

iii. Review Date

iv. # Readers of the review

v. # times review was clicked as “Helpful”

vi. User Ratings on the following parameters (in 1-5 scale):

1. Overall

2. Value

3. Rooms

4. Location

5. Cleanliness

6. Check in/front desk

7. Service

8. Business Service

vii. Please note that whenever a value is missing (such as ratings), the value will be represented as “-1”.

____________________________________________________________________________________________________________
Design: 



1.	Data ingestion : 



•	Jackson JSON Processor: Is used to parse the json file and load it into SQL Table.
•	Hibernate:  Is used to ingest the parsed data into the SQL table.

2.	Service layer :

•	Functionality exposed as RestFull service with help of Jersey.
    This send json which can be parsed irrespective of platform, can be used in WebApp or Mobile APP of any platform.

3.	NPL Engine : 

•	openNLP : Is used to tokenize and generate parse-tree of the reviews on document level

•	Bag-Of-Words : Is used for sentiment Analysis and stop-word removal. 

i.	Sentiment bag-of-words consists of ~3000 positive and ~3000 negative words

ii.	Stop words dictionary has  ~200-300 words





4.	User-Interface Engine :


•	HTML 

•	Jquery bootstrap 

•	Jquery Sliders

•	Jquery Word cloud


Algorithm: 



•	Assumption: The data and review are distributed across wide price ranges. Where the min ~$5 and max ~$300 (each hotel has its own range of price, we used avg of that for each hotel).
It would be unfair for hotel and customer to do any analysis w/o segmentation of hotel on price because the expectation of end-user from a budget hotel and a luxury hotel doesn’t overlap. One cannot rate low a budget hotel on service because they didn’t had free-wifi/swing-pool but will in luxury. 



•	Segmentation:  Algorithm was bored from box-plot. The data was segmented by ~upper-whisker and ~lower-whisker. 



•	Theme of ratings : 


	We went for bi-gram to get theme of user-comments after removing the stop words.


	~TF: Each rating has multiple bi-grams. We got the frequency of each bi-gram corresponding to a rating 


	~IDF : We inverse indexed the bi-gram by rating frequency and also we got a over-all ratings associated with bi-gram by averaged out ratings for all occurrence of specific bi-gram:


	UI-Engine: We have sliders for each rating fields and a word-cloud. The UI-engine power the insights where a user can set ratings to a particular value can word-cloud would give them the theme for that ratings. 




•	Aspect-based-sentiment : 


	Sentiment: Bag-of-words is used for extracting sentiment out of each line in review and then aggregate it on document level to get the sentiment of the document.


	Aspect: Triplet extraction (http://ailab.ijs.si/dunja/SiKDD2007/Papers/Rusu_Trippels.pdf) is used where the main subject is mapped to aspect and objects is mapped to feature of aspect.


	UI-Engine: Concept Map (http://www.findtheconversation.com/concept-map/) {the link is for reference only}.The concept map will  be powered by ASPECT-SENTIMENT-FEATURES relation.

This will give end-user interactive insight at all level. User can check out what are aspect and features are for positive & negative or what are the features of specific aspect in positive & negative. What are the features associated with positive or negative sentiments.

____________________________________________________________________________________________________________
Installtion : 
TODO 
