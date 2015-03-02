# Sample User Management Application

## Current State:
 * This is a bare bone Spring MVC Application, backed with In-Memory HSQL DB.
 * On Startup there are couple of users, with pre-initialized roles, and
 * Login feature on the landing page, just prints message on a result page, depending on whether login passed or failed
 * No tests

## Roles:
   1. Moderator: User with a "moderator" role can edit existing records in a database.
   2. Admin: User with "admin" role can do the same thing as the user with "moderator" role plus create new records.
 
## Desired State:
 * Couple of new pages should be added
  1. Create new user, with features like
    1. Must check valid username - not empty (null,blank,spaces), no longer than 255 chars, only alphanumeric (NICE to HAVE)
    2. Must not be same as one of existing users
    3. Must have valid password - minimum of 8 chars, and not same as username, must be aphanumeric
  2. Update new user
    1. Allow password change, once user is logged in, with same rules as above

## Non functional requirements:
  1. Must allow concurrent updates
  2. New Tests for new code added, to create and update
  3. New Tests for existing method to login
  4. Unit and Integration tests written separately
  5. Should  be production quality code
  6. We will look for java coding standards, best practices etc
 
