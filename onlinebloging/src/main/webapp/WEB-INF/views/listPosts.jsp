
<!-- Page Content -->
<div class="container">

	<div class="row">

		<!-- Blog Entries Column -->
		<div class="col-md-8">

			<!-- my code breadcrumb -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllPosts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Posts</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryPosts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>

			<h1 class="my-4">
				Page Heading <small>Secondary Text</small>
			</h1>

			<!-- Blog Post -->
			<div class="card mb-4">
				<img class="card-img-top" src="http://placehold.it/750x300"
					alt="Card image cap">
				<div class="card-body">
					<h2 class="card-title">Post Title</h2>
					<p class="card-text">Lorem ipsum dolor sit amet, consectetur
						adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex
						quis soluta, a laboriosam. Dicta expedita corporis animi vero
						voluptate voluptatibus possimus, veniam magni quis!</p>
					<a href="#" class="btn btn-primary">Read More &rarr;</a>
				</div>
				<div class="card-footer text-muted">
					Posted on January 1, 2017 by <a href="#">Start Bootstrap</a>
				</div>
			</div>

			<!-- Blog Post -->
			<!--  <div class="card mb-4">
          <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">Post Title</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!</p>
            <a href="#" class="btn btn-primary">Read More &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            Posted on January 1, 2017 by
            <a href="#">Start Bootstrap</a>
          </div>
        </div>

        Blog Post
        <div class="card mb-4">
          <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title">Post Title</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reiciendis aliquid atque, nulla? Quos cum ex quis soluta, a laboriosam. Dicta expedita corporis animi vero voluptate voluptatibus possimus, veniam magni quis!</p>
            <a href="#" class="btn btn-primary">Read More &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            Posted on January 1, 2017 by
            <a href="#">Start Bootstrap</a>
          </div>
        </div> -->

			<!-- Pagination -->
			<ul class="pagination justify-content-center mb-4">
				<li class="page-item"><a class="page-link" href="#">&larr;
						Older</a></li>
				<li class="page-item disabled"><a class="page-link" href="#">Newer
						&rarr;</a></li>
			</ul>

		</div>

		<!-- Sidebar Widgets Column -->
		<%@ include file="./shared/sidebar.jsp"%>
	</div>
	<!-- /.row -->

</div>
<!-- /.container -->
