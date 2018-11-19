use a2;
ALTER TABLE Keyword AUTO_INCREMENT=1;
alter table PeopleInvolved auto_increment = 1;
alter table Role auto_increment=1;

Delimiter &&
create procedure add_keyword(in tag varchar(45), out id int)
	begin
    insert into Keyword(Tag) value(tag);
    set id = (select MAX(ID) from Keyword);
    end &&

Delimiter !!
create procedure add_Book(in isbn char(13), in title varchar(45), in publisher varchar(45), in NumberPage int, in YearPublication int, in EdditionNumber int, in Abstract mediumtext, in tag varchar(45), out res boolean)
	begin
		set res = 0;
		insert into Book(ISBN, Title, Publisher, NumberOfPages, YearOfPublication, EditionNumber, Abstract)
        value(isbn, title, publisher, NumberPage, YearPublication, EdditonNumber, Abstract);
        call add_keyword(tag, @res);
        insert into BookKeyword value (isbn, @res);
        set res = 1;
	end !!

Delimiter ~~~
create procedure add_peopleInvolved(in firstname varchar(45), in middlename varchar(45), in familyname varchar(45), in gender tinyint, out res boolean, out id int)
	begin 
		
        insert into PeopleInvolved(FirstName, MiddleName, FamilyName, Gender)
        value(firstname, middlename, familyname, gender);
        set id = (select MAX(ID) from PeopleInvolved);
    end ~~~
Delimiter %%%
create procedure add_book_author(in isbn char(13), in firstname varchar(45), in middlename varchar(45), in familyname varchar(45), in gender tinyint, out res boolean, out id int )
	begin
    
    call add_peopleInvolved(firstname, middlename, familyname, gender, @p_id);
    insert into BookAuthor(ISBN, Author_ID) value(isbn, @p_id);
    end%%%
    
## need to know what is the producer's id
Delimiter %%
create procedure add_music(in albumname varchar(45), in year int, in musicname varchar(45), in language varchar(45), in disktype tinyint, in producerid int, in firstname varchar(45), in middlename varchar(45), in familyname varchar(45), in gender tinyint)
	begin
		call add_peopleinvolved(firstname, middlename, famlilyname, gender, @p_id);
		insert into Music(AlbumName, Year, MusicName, Language, DiskType, Producer_ID)
        value(albumname, year, musicname, language, disktype, @p_id);
        
    end %%

Delimiter %@
create procedure add_people_music_(in albumname varchar(45), in year int, in musicname varchar(45), in iswriter tinyint, in iscomposer tinyint, in isarranger tinyint, in firstname varchar(45), in middlename varchar(45), in familyname varchar(45),  in gender tinyint)
	begin 
     call add_peopleinvolved(firstname, middlename, famlilyname, gender, @p_id);
     insert into PeopleInvolvedMusic(AlbumName, Year, MusicName, PeopleInvolved_ID, IsSongwriter, IsComposer, IsArranger)
     value(albumname, year, muisicname, @p_id, iswriter, iscomposer, isarranger);
    end %@
    
Delimiter ^&
create procedure add_singer(in Albumname varchar(45), in year int, in musicname varchar(45), in firstname varchar(45), in middlename varchar(45), in familyname varchar(45), in gender tinyint)
	begin
		call add_peopleinvolved(firstname, middlename, famlilyname, gender, @p_id);
		insert into MusicSinger(AlbumName, Year, MusicName, PeopleInvolved_ID) 
        value (albumname, year, musicname, @p_id);
    
    end^&
    
Delimiter ***
create procedure add_movie(in moviename varchar(45), in year int)
	begin
		insert into Movie(MovieName, Year) 
        value(moviename, year);
        
    end ***
Delimiter &&&

create procedure add_role(in description varchar(45), out id int)
	begin
    insert into Role(Description) value(description);
    set id = (select MAX(ID) from Role);
    end&&&
    
Delimiter !!!
# adding data into CrewMember, Role, PeopleInvolved and Award tables.
create procedure add_crew_member(in peopleinvolved int, in moviename varchar(45),  in releaseyear int, in firstname varchar(45), in middlename  varchar(45), in familyname varchar(45), in gender tinyint, in award tinyint)
	begin

		call add_role(description, @id);
        call add_peopleinvolved(firstname, middlename, famlilyname, gender, @p_id);
        insert into CrewMember(PeopleInvolved_ID, MovieName, ReleaseYear, Role_ID) 
        value(@p_id, moviename, releaseyear, @id);
        insert into Award(PeopleInvolved_ID, MovieName, Year, Award)
        value(@p_id, moviename, year, award);
    end!!!
Delimiter %







