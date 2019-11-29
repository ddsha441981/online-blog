   <div class="col-md-4">

        <!-- Search Widget -->
        <div class="card my-4">
          <h5 class="card-header">Search</h5>
          <div class="card-body">
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Search for...">
              <span class="input-group-btn">
                <button class="btn btn-secondary" type="button">Go!</button>
              </span>
            </div>
          </div>
        </div>

        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">Categories</h5>
          <div class="card-body">
            <div class="row">
            
            <c:forEach items="${categories}" var="category">
              <div class="col-lg-6">
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="${contextRoot}/show/category/${category.id}/posts" id="a_${category.name}">${category.name}</a>
                  </li>
                 <!--  <li>
                    <a href="#">HTML</a>
                  </li>
                  <li>
                    <a href="#">Freebies</a>
                  </li> -->
                </ul>
              </div>
               </c:forEach>
              <%-- <div class="col-lg-6">
                <ul class="list-unstyled mb-0">
                  <li>
                  <a href="#">${category.name}</a>
                    <!-- <a href="#">JavaScript</a> -->
                  </li>
                  <!-- <li>
                    <a href="#">CSS</a>
                  </li>
                  <li>
                    <a href="#">Tutorials</a>
                  </li> -->
                </ul>
              </div> --%>
              
             
              
            </div>
          </div>
        </div>

        <!-- Side Widget -->
        <div class="card my-4">
          <h5 class="card-header">Side Widget</h5>
          <div class="card-body">
            You can put anything you want inside of these side widgets. They are easy to use, and feature the new Bootstrap 4 card containers!
          </div>
        </div>
        
        <!-- User Profile Card div -->
        
        <%-- <div class="card">
  <img src="${images}/team2.jpg" alt="John" style="width:100%">
  <h1>John Doe</h1>
  <p class="title">CEO & Founder, Example</p>
  <p>Harvard University</p>
  <a href="#"><i class="fa fa-dribbble"></i></a>
  <a href="#"><i class="fa fa-twitter"></i></a>
  <a href="#"><i class="fa fa-linkedin"></i></a>
  <a href="#"><i class="fa fa-facebook"></i></a>
  <p><button>Contact</button></p>
</div> --%>

      </div>

