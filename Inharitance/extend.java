/*
  parent -> child -> grandChild
  Have always parent child relationship
  parent->child :pc relation
  parent->grendchild : pc relation
  child ->grand child : pc relation
  p1 , p2 : c extends p1 and p2  : Does not supported in java
  
  pointer of parent obj which points to parent can excess [ parent access ]
  pointer of parent obj which points to child can excess [ parent + child whole access]
  pointer of child obj which points to child can excess [  child access ]
  pointer of child obj which points to parent can excess [  syntax error ]
*/
  prevention of overriding
  1.final keyword - use this keyword in parent method [ tring overring final method gives syntex error]
  2.static keyword/overhiding- use this keyword in parent and child  method [tring overring final method not gives syntex error]
  3.private method can not be overrided.
 
